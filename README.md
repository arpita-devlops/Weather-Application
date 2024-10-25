# Weather Application

## Overview
The **Weather Application** provides users with the ability to view weather data for various locations. Users can register as new users or log in to retrieve real-time weather information based on location. This application integrates a responsive frontend and a robust backend to offer seamless data management and presentation of weather statistics.

## Features
- **User Authentication:** New user registration and returning user login.
- **Weather Data Retrieval:** Get weather information for specified locations.
- **Data Storage:** Efficient database handling for user information.
- **Error Handling:** Graceful management of invalid inputs or connection errors.
  
## Project Structure
- **Source Code:**
  - `Application.java`: Entry point of the application.
  - `Database.java`: Manages user and weather data.
  - `main_Controller.java`: Handles the main user operations.
  - `weatherData.java`: Manages weather-specific data.
  
- **Frontend (HTML Files):**
  - `index.html`: Main landing page.
  - `newUserReg.html`: User registration form.
  - `returningUser.html`: Login page for returning users.
  - `result.html`: Displays the weather data.
  - `error.html`: Displays error messages.

- **Build Files:**
  - `build.gradle`: Gradle build configuration.

## Technologies Used
- **Backend:** Java, Gradle
- **Frontend:** HTML, CSS, JavaScript
- **Database:** Integrated database for user and weather data
- **Build Tool:** Gradle

## Setup Instructions
1. **Clone the repository:**
   ```bash
   git clone <repository-url>
   ```
2. **Navigate to the project directory:**
   ```bash
   cd Weather_Application-master
   ```
3. **Build the project using Gradle:**
   ```bash
   gradle build
   ```
4. **Run the application:**
   ```bash
   gradle run
   ```

## Usage
- Open the web application in your browser and follow the prompts to either register as a new user or log in.
- Input your location to retrieve weather data.

## Contribution Guidelines
We welcome contributions to improve the project. Please create a pull request for any changes or new features you'd like to add.
