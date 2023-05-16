# Mapping Practice

## Framework and language used
* Spring Boot
* Java 
---

## Data flow
1. controller
2. model        
3. Dto
3. service 
4. repository

---
## Steps to run project

- Download the source code and import in intellijIDEA.
- Put these Properties into resourse package in application properties.

``` spring.datasource.url = jdbc:mysql://localhost:3306/mappings_practice```

```spring.datasource.username =root```

```spring.datasource.password =MySQL@00```

```spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver```

```spring.jpa.show-sql = true```

```spring.jpa.properties.hibernate.format_sql=true```
           
```spring.jpa.hibernate.ddl-auto = update```

```spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.MySQL5Dialect```

- Go to localhost:8080/
- For mysql workbench localHost:3306/
## Data Structure used
* List - ArrayList
---

## Project Summary
```In this project I am doing some Mappings practice. So we can do some basic CRUD operations on each 5 Controllers class  . we can perform operations like save student as well as get student and delete based on id and post student and doing same things in 4 more controllers. I have used  validations and mappings like @OneToOne, @OneToMany,  @ManyToOne, @ManyToMany in this project.```



