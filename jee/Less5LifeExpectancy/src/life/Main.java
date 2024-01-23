package life;

/**
 * Exercise 2 - Life expectancy by country (Data Manipulation) \
 * 
 */

public class Main {

	public static void main(String[] args) {
		final String url_countries = "http://vocab.nic.in/rest.php/country/json";
		final String url_countries_info = "http://api.worldbank.org/v2/countries/?format=xml&per_page=304";
		final String url_countries_life_expectancy = "http://api.worldbank.org/v2/countries/all/indicators/SP.DYN.LE00.IN/?format=xml&date=2014&per_page=264";

		String countries_txt = InternetContent.get(url_countries);
		String countries_xml = InternetContent.get(url_countries_info);
		String life_expectancy_xml = InternetContent.get(url_countries_life_expectancy);
		Countries countries = new Countries();
		CountriesJSONParser.setCountries(countries, countries_txt);
		CountriesSAXParser.setWorldBankData(countries, countries_xml);
		CountriesDOMParser.setLifeExpectancy(countries, life_expectancy_xml);
	}
}