# GeoKeyAPI

GeoKeyAPI is an API developed in Java with Spring Boot, which provides information about countries, states, and cities. The API allows you to efficiently retrieve geographic data, supporting queries for all countries, states by country, and cities by state and country.

## Features

- **List all countries**: The API allows you to get a list of all available countries, including information such as name, phone code, flag emoji, currency, and currency symbol.
- **List states by country**: The API allows you to retrieve a list of all available states in a specific country, returning the names of the states.
- **List cities by state and country**: The API enables you to search for all cities in a specific state within a given country.

## Endpoints

- `GET /locales/country/all` - Returns a list of all countries.
- `GET /locales/state/findAllStatesByCountry/{country}` - Returns a list of all states in a specific country.
- `GET /locales/city/findAllCityByCountryAndStates/{country}/{state}` - Returns a list of cities in a specific state and country.

## Data Source

The data for countries, states, and cities used by the API was extracted from the following repository: [dr5hn/countries-states-cities-database](https://github.com/dr5hn/countries-states-cities-database). This repository contains a complete database with updated geographic information, providing a wide range of data on countries, states, and cities.

## Technologies Used

- **Java 17**: Programming language used in development.
- **Spring Boot 3.3.4**: Framework used to build the REST API.
- **PostgreSQL**: Database used to store information about countries, states, and cities.
- **Spring Data JPA**: To simplify database operations.
- **HikariCP**: For managing database connections.

## Installation

1. Clone this repository:

   ```bash
   git clone https://github.com/your-username/GeoKeyAPI.git
   ```
2. Navigate to the project directory:
   ```bash
   cd GeoKeyAPI
   ```
3. Configure your PostgreSQL database with the data provided in the [data repository](https://github.com/dr5hn/countries-states-cities-database). To do this, download the content of the repository and import the SQL files into your PostgreSQL database.

4. Configure the database properties in the `application.properties` file:
   ```bash
   spring.datasource.url=jdbc:postgresql://localhost:5432/your-database
   spring.datasource.username=your-username
   spring.datasource.password=your-password
   spring.jpa.hibernate.ddl-auto=update
   ```

## Contribution

Contributions are welcome! If you would like to contribute to the project, please fork the repository, create a branch with your changes, and submit a pull request.

## License

This project is licensed under the MIT license. See the [LICENSE](./LICENSE) file for more details.

## Credits

- [dr5hn/countries-states-cities-database](https://github.com/dr5hn/countries-states-cities-database): Database used in the project.
