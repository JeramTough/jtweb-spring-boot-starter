package com.jeramtough.jtweb.action.filter;

import org.springframework.util.AntPathMatcher;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * <pre>
 * Created on 2020/3/23 19:25
 * by @author JeramTough
 * </pre>
 */
public abstract class AbastractSwaggerFilter implements Filter, BaseSwaggerFilter {

    private AntPathMatcher antPathMatcher = new AntPathMatcher("/");

    /**
     * 静态资源
     */
    private static Set<String> staticResourceTypes = new HashSet<String>();

    private static final String[] SWAGGER_URLS = {
            "/swagger-resources",
            "/v2/api-docs",
            "/v2/api-docs-ext",
            "/doc.html",
            "/webjars",
            "/swagger-ui.html",
            "/swagger-resources/**",
            "/images/**",
            "/webjars/**",
            "/configuration/ui",
            "/configuration/security",
            "/api-docs-ext",
            "/api-docs",
            "/swagger-resources/configuration/ui/**",
            "/swagger-resources/configuration/security"
    };

    public AbastractSwaggerFilter() {
        staticResourceTypes.add(".html");
        staticResourceTypes.add(".css");
        staticResourceTypes.add(".js");
        staticResourceTypes.add(".png");
        staticResourceTypes.add(".json");
        staticResourceTypes.add(".geojson");
        staticResourceTypes.add(".jpg");
        staticResourceTypes.add(".otf");
        staticResourceTypes.add(".eot");
        staticResourceTypes.add(".svg");
        staticResourceTypes.add(".ttf");
        staticResourceTypes.add(".woff");
        staticResourceTypes.add(".gif");
        staticResourceTypes.add(".ico");
        staticResourceTypes.add(".txt");
        staticResourceTypes.add(".gzip");
        staticResourceTypes.add(".xz");
        staticResourceTypes.add(".tar.gz");
        staticResourceTypes.add(".tar.bz2");
        staticResourceTypes.add(".jar");
        staticResourceTypes.add(".war");
        staticResourceTypes.add(".7z");
        staticResourceTypes.add(".tgz");
        staticResourceTypes.add(".gz");
        staticResourceTypes.add(".map");
    }


    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse,
                         FilterChain filterChain) throws IOException, ServletException {

        HttpServletRequest request = (HttpServletRequest) servletRequest;
        String url = request.getRequestURI();
        url = url.replaceFirst(request.getContextPath(), "");
        String finalUrl = url;

        boolean isSwagger = Arrays.stream(SWAGGER_URLS).anyMatch(
                s -> getAntPathMatcher().match(s, finalUrl));

        if (isSwagger) {
            filterChain.doFilter(servletRequest, servletResponse);
            return;
        }

        if (getOponUrls() != null) {
            boolean isOpenUrls = Arrays.stream(getOponUrls()).anyMatch(
                    s -> getAntPathMatcher().match(s, finalUrl));
            if (isOpenUrls) {
                filterChain.doFilter(servletRequest, servletResponse);
                return;
            }
        }

        if (isOpenStaticResource()) {
            boolean isStaticResources = staticResourceTypes.parallelStream()
                                                           .anyMatch(finalUrl::endsWith);
            if (isStaticResources) {
                filterChain.doFilter(servletRequest, servletResponse);
                return;
            }
        }


        doFilter2(servletRequest, servletResponse, filterChain);
    }

    public abstract boolean isOpenStaticResource();

    public abstract String[] getOponUrls();

    public abstract void doFilter2(ServletRequest servletRequest,
                                   ServletResponse servletResponse,
                                   FilterChain filterChain);

    public AntPathMatcher getAntPathMatcher() {
        return antPathMatcher;
    }

}
