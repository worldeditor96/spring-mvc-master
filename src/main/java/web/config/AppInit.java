package web.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class AppInit extends AbstractAnnotationConfigDispatcherServletInitializer {

    // Метод, указывающий на класс конфигурации
    //метод getRootConfigClasses() НЕ должен возвращать null
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null;
    }


    // Добавление конфигурации, в которой инициализируем ViewResolver, для корректного отображения jsp.
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{
                WebConfig.class
        };
    }


    /* Данный метод указывает url, на котором будет базироваться приложение */
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

}