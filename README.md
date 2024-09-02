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
└── pom.xml
```

## Setup and Configuration

1. Ensure you have Java 17 and Maven installed on your system.

2. Clone the repository:
   ```
   git clone https://github.com/yourusername/tripcraft-backend.git
   cd tripcraft-backend
   ```

3. Configure the database connection in `src/main/resources/application.properties`:
   ```
   spring.datasource.url=jdbc:postgresql://localhost:5432/tripcraft
   spring.datasource.username=your_username
   spring.datasource.password=your_password
   spring.jpa.hibernate.ddl-auto=update
   ```
   Replace `your_username` and `your_password` with your PostgreSQL credentials.

4. Build the project:
   ```
   mvn clean install
   ```

5. Run the application:
   ```
   mvn spring-boot:run
   ```

The application will start and be available at `http://localhost:8080`.

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
