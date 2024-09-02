# TripCraft Backend

TripCraft is a Spring Boot application for managing travel plans and itineraries. This backend service provides RESTful APIs for creating and managing users, trips, and destinations.

[![Java CI with Maven](https://github.com/kuldeep27396/tripcraft-backend/actions/workflows/maven.yml/badge.svg)](https://github.com/kuldeep27396/tripcraft-backend/actions/workflows/maven.yml)

## Project Structure

```
tripcraft-backend/
│
├── src/main/java/com/tripcraft/backend/
│   ├── config/
│   │   └── SecurityConfig.java
│   ├── controller/
│   │   ├── TripController.java
│   │   └── UserController.java
│   ├── model/
│   │   ├── User.java
│   │   ├── Trip.java
│   │   └── Destination.java
│   ├── repository/
│   │   ├── UserRepository.java
│   │   └── TripRepository.java
│   ├── service/
│   │   ├── TripService.java
│   │   └── UserService.java
│   └── TripcraftBackendApplication.java
├── src/main/resources/
│   └── application.properties
├── .github/workflows/
│   └── maven.yml
└── pom.xml
```

## Setup and Configuration

1. Ensure you have Java 17 and Maven installed on your system.

2. Clone the repository:
   ```
   git clone https://github.com/kuldeep27396/tripcraft-backend.git
   cd tripcraft-backend
   ```

3. Configure the database connection in `src/main/resources/application.properties`:
   ```
   spring.datasource.url=${DB_URL}
   spring.datasource.username=${DB_USERNAME}
   spring.datasource.password=${DB_PASSWORD}
   spring.jpa.hibernate.ddl-auto=update
   ```

4. Set up environment variables for your database connection. This project uses Tembo OLTP, a managed PostgreSQL service.

5. Build the project:
   ```
   mvn clean install
   ```

6. Run the application:
   ```
   mvn spring-boot:run
   ```

The application will start and be available at `http://localhost:8080`.

## Database Configuration

This project uses Tembo OLTP, a managed PostgreSQL service. To set up your database:

1. Sign up for a Tembo OLTP account and create a new instance.
2. Note down your instance's hostname, port, database name, username, and password.
3. Set these as environment variables in your development environment and in your GitHub repository secrets for CI/CD.

## GitHub Actions

This project uses GitHub Actions for Continuous Integration. The workflow is defined in `.github/workflows/maven.yml`. It does the following:

- Triggered on push to the main branch and on pull requests to the main branch.
- Sets up Java 11.
- Builds the project with Maven.
- Uses GitHub Secrets for database credentials during the build process.

To set up GitHub Actions:

1. Go to your GitHub repository's "Settings" tab.
2. Click on "Secrets and variables" in the left sidebar, then "Actions".
3. Add your Tembo OLTP credentials as secrets:
   - DB_URL
   - DB_USERNAME
   - DB_PASSWORD

## API Endpoints

- Users:
  - GET `/api/users`: Retrieve all users
  - GET `/api/users/{id}`: Retrieve a specific user
  - POST `/api/users`: Create a new user

- Trips:
  - GET `/api/trips`: Retrieve all trips
  - GET `/api/trips/{id}`: Retrieve a specific trip
  - POST `/api/trips`: Create a new trip

## Dependencies

This project uses the following major dependencies:

- Spring Boot
- Spring Data JPA
- Spring Security
- PostgreSQL Driver

For a complete list of dependencies, please refer to the `pom.xml` file.

## Security

The current security configuration allows all requests without authentication. This is suitable for development but should be updated with proper authentication and authorization before deploying to production.

## Contributing

Please read `CONTRIBUTING.md` for details on our code of conduct, and the process for submitting pull requests.

## License

This project is licensed under the MIT License - see the `LICENSE.md` file for details.
