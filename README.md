# Spring Boot 3.4.0 Pinned Virtual Thread Issue

This repository demonstrates an issue in Spring Boot 3.4.0: When calling the Actuator's health endpoint whilst wiring a lazily wired Spring Boot application that uses Virtual Threads, the JVM reports pinned threads. This is a regression from Spring Boot 3.3.6 which did not report pinned threads.

