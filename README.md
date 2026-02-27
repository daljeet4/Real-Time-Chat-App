Real-Time Chat Application

A real-time chat application built using Spring Boot (Backend) and HTML, CSS, JavaScript (Frontend).
This application enables users to send and receive messages instantly using WebSocket communication.

🚀 Features

✔️ Real-time messaging using WebSockets
✔️ Multiple users can chat simultaneously
✔️ Instant message broadcast
✔️ Lightweight and responsive UI
✔️ Backend powered by Spring Boot
✔️ Scalable architecture

🛠️ Tech Stack
Layer	Technology
Backend	Spring Boot
Real-Time Communication	WebSocket
Frontend	HTML, CSS, JavaScript
Build Tool	Maven
Version Control	Git & GitHub
📁 Project Structure
Real-Time-Chat-App/
│── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/chatapp/
│   │   │       ├── controller/
│   │   │       ├── config/
│   │   │       └── ChatApplication.java
│   │   └── resources/
│   │       ├── static/
│   │       └── application.properties
│── pom.xml
└── README.md
⚙️ How It Works

Spring Boot configures WebSocket endpoint.

Clients connect using WebSocket.

When a user sends a message:

The message is sent to the server.

The server broadcasts it to all connected users.

Messages appear instantly without refreshing the page.

🔧 Installation & Setup
1️⃣ Clone the repository
git clone https://github.com/daljeet4/Real-Time-Chat-App.git
cd Real-Time-Chat-App
2️⃣ Build the project

Make sure you have:

Java 17+

Maven installed

Run:

mvn clean install
3️⃣ Run the application
mvn spring-boot:run

or run the generated jar:

java -jar target/real-time-chat-app.jar
🌐 Access the Application

Open your browser:

http://localhost:8080
✨ Store messages in database (MySQL/MongoDB)
✨ Add timestamps & user status
✨ Deploy on AWS / Render
