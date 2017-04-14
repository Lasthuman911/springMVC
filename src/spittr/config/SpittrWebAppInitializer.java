package spittr.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * 扩展AbstractAnnotationConfigDispatcherServletInitializer的任意类都会自
 动地配置DispatcherServlet和Spring应用上下文， Spring的应用上下文会位于应用程序
 的Servlet上下文之中
 */
public class SpittrWebAppInitializer
        extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected String[] getServletMappings() {
        return new String[] { "/" };//将dispatchServlet映射到"/",它会是应用的默认Servlet。 它会处理进入应用的所有请求
    }
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[] { RootConfig.class };//根配置定义在RootConfig中
    }
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[] { WebConfig.class };//DispatcherServlet的配置声明在WebConfig中
    }
}