FROM java:8
Expose 8089
ADD /target/timesheet-1.0.jar timesheet-1.0.jar
ENTRYPOINT ["java", "-jar", "timesheet-1.0.jar"]