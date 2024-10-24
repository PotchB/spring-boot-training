package com.dopveb.sales_records;

import java.util.Locale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

@SpringBootApplication
public class SalesRecordsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SalesRecordsApplication.class, args);
	}

	// @Bean
	// public LocaleResolver localeResolver() {
	// SessionLocaleResolver localeResolver = new SessionLocaleResolver();
	// localeResolver.setDefaultLocale(Locale.US); // Set default locale to US or
	// your desired locale
	// return localeResolver;
	// }

	@Bean
	public LocaleResolver localeResolver() {
		SessionLocaleResolver localeResolver = new SessionLocaleResolver();
		localeResolver.setDefaultLocale(new Locale("fil", "PH")); // Set default locale to Philippines
		return localeResolver;
	}
}