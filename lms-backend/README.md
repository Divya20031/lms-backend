# LMS Backend (Spring Boot Starter)

This is a **starter scaffold** for an advanced **Learning Management System (LMS)** built with Spring Boot 3 (Java 17).
It compiles & runs out-of-the-box using **H2 in-memory DB** and **open endpoints** (security TODO).

## Run
```bash
# From project root
./mvnw spring-boot:run   # (Linux/Mac)
mvnw.cmd spring-boot:run # (Windows) or use your IDE to run LmsApplication
```
Then open: `http://localhost:8080/api/health`

H2 console: `http://localhost:8080/h2-console` (JDBC URL: `jdbc:h2:mem:lmsdb`)

## Next steps (advanced):
- Replace open security with JWT-based auth (see `config/SecurityConfig.java` TODOs).
- Swap H2 for MySQL/Postgres in `application.properties`.
- Add payment, quiz engine, file storage, caching, and WebSocket chat.
