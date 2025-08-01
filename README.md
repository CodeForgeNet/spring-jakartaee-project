# 🧑‍💼 Employee Management System – Backend (Spring Boot + Jakarta EE)

This is the **backend service** for the Employee Management System. It provides a RESTful API for managing employee records. Built using **Spring Boot**, **Jakarta EE**, and **MySQL**, this backend connects with a React + Vite frontend to deliver full-stack CRUD functionality.

---

## 🔧 Tech Stack

| Tool/Framework     | Purpose                        |
|--------------------|--------------------------------|
| Spring Boot        | Application framework          |
| Spring Data JPA    | ORM and data access            |
| Jakarta EE         | Annotations & validation       |
| MySQL              | Relational database            |
| Maven              | Dependency & build management  |

---

## 📁 Project Structure

spring-jakartaee-project-main/
├── src/
│   └── main/
│       ├── java/com/yourorg/employeesystem/
│       │   ├── controller/       # REST API Controllers
│       │   ├── model/            # Entity definitions
│       │   ├── repository/       # JPA interfaces
│       │   └── service/          # Business logic layer
│       └── resources/
│           ├── application.properties
│           └── data.sql (optional demo data)
├── pom.xml
└── README.md

---

## ⚙️ Configuration

Edit `src/main/resources/application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/ems
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect

spring.cors.allowed-origins=http://localhost:5173

✅ Make sure MySQL is running and the ems database exists:

CREATE DATABASE ems;


⸻

🚀 Running the Application

From IntelliJ IDEA:
	1.	Open the project in IntelliJ.
	2.	Locate EmsBackendApplication.java.
	3.	Right-click and select Run.

Or via Terminal:

mvn spring-boot:run

📡 API will be available at:

http://localhost:8080/api/employees


⸻

🧪 Available REST Endpoints

Method	Endpoint	Description
GET	/api/employees	Get all employees
GET	/api/employees/{id}	Get employee by ID
POST	/api/employees	Add new employee
PUT	/api/employees/{id}	Update employee by ID
DELETE	/api/employees/{id}	Delete employee by ID


⸻

🔄 Integration with Frontend

This backend is built to work seamlessly with the React + Vite frontend:
	•	🔗 Frontend repo: "https://github.com/CodeForgeNet/react-vite-starter";
	•	Make sure CORS is enabled for port 5173 (Vite default).

⸻

📚 Learning Objectives
	•	REST API design using Spring Boot
	•	Layered architecture: controller, service, repository
	•	Entity-relationship mapping using Hibernate
	•	Jakarta EE annotations and form validation
	•	Integration with MySQL database

⸻

🤝 Contribution

Feel free to fork this repo, raise issues, or submit PRs for features like:
	•	Authentication
	•	Search/filter
	•	Pagination
	•	Swagger documentation



⸻

👨‍💻 Author

Karan Singh
📬 Contact: connect.lalukumar@gmail.com


I can help scaffold that too.
