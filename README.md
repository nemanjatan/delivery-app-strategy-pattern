# Delivery Service Project 🚚

This project implements a delivery service system using Spring Boot, focusing on the Strategy Design Pattern to select the optimal delivery method based on the package details and delivery requirements.

The service supports different delivery strategies, including standard delivery, express delivery, and drone delivery, demonstrating how to dynamically select a strategy at runtime.

## Project Structure

The project is organized into several key packages:

- `controller`: Contains `DeliveryController` for handling HTTP requests.
- `service`: Contains `DeliverService` that manages the logic to select the appropriate delivery strategy.
- `strategy`: Contains `DeliverStrategy` interface and its implementations (`StandardDelivery`, `ExpressDelivery`, `DroneDelivery`) that define various delivery methods.
- `DeliveryApplication`: The main application class that bootstraps the Spring Boot application.

## Getting Started

### Prerequisites

- Java JDK 11 or later
- Maven 3.2+ (for building the project)
- Spring Boot 2.3.0.RELEASE or later

### Running the Application 🏃🏽‍♂️

1. Clone the repository to your local machine.
2. Navigate to the project directory.
3. Build the project using Maven:

   ```bash
   mvn clean install
4. Run the application:

   ```bash
   java -jar target/delivery-service-0.0.1-SNAPSHOT.jar
Alternatively, if you're using an IDE, you can run the DeliveryApplication.java class directly.

### Accessing the Delivery Service
Once the application is running, you can access the delivery service by making HTTP GET requests to:

   ```bash
   http://localhost:8080/delivery?packageValue=<value>&isExpress=<true|false>&distance=<distance>
   ```

Replace `<value>`, `<true|false>`, and `<distance>` with appropriate values to test different delivery strategies.

### API Reference
#### GET /delivery
- Parameters:
  - `packageValue`: int - The value of the package.
  - `isExpress`: boolean - Whether the delivery is express.
  - `distance`: double - The distance to the delivery destination.
- Response: A string message indicating the delivery strategy activated.

### Learn More 📖
For those interested in a deeper understanding of the Strategy Pattern and its implementation in this project, a video tutorial and an accompanying article are available:

- Video Tutorial: [Strategy Pattern in Java: Building a Delivery Management App](https://www.youtube.com/watch?v=Nos2VpE6Jj0)
- Detailed Article: For an in-depth exploration of this project and the Strategy Pattern, check out our [comprehensive guide on building a delivery management app using the Strategy Pattern in Java](https://nemanjatanaskovic.com/strategy-pattern-in-java-building-a-delivery-management-app/).


### Contributing
Contributions are welcome! Please feel free to submit a pull request or open an issue for any bugs or improvements.

### License
This project is open-sourced under the MIT License.
