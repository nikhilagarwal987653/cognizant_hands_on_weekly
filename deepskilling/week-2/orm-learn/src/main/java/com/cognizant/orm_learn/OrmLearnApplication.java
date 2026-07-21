package com.cognizant.orm_learn;

import com.cognizant.orm_learn.model.Country;
import com.cognizant.orm_learn.service.CountryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class OrmLearnApplication implements CommandLineRunner {

	private static final Logger LOGGER =
			LoggerFactory.getLogger(OrmLearnApplication.class);

	private final CountryService countryService;

	public OrmLearnApplication(CountryService countryService) {
		this.countryService = countryService;
	}

	public static void main(String[] args) {
		SpringApplication.run(OrmLearnApplication.class, args);
		LOGGER.info("Inside main");
	}

	@Override
	public void run(String... args) {
		testGetAllCountries();
	}

	private void testGetAllCountries() {
		LOGGER.info("Start");

		List<Country> countries = countryService.getAllCountries();

		LOGGER.debug("countries={}", countries);

		countries.forEach(country ->
				System.out.println(
						country.getCode() + " - " + country.getName()
				)
		);

		LOGGER.info("End");
	}
}