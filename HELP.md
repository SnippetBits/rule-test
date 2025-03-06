# Read Me First
The following was discovered as part of building this project:

* The original package name 'com.example.rule-test' is invalid and this project uses 'com.example.rule_test' instead.

# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/3.4.3/maven-plugin)
* [Create an OCI image](https://docs.spring.io/spring-boot/3.4.3/maven-plugin/build-image.html)

### Maven Parent overrides

Due to Maven's design, elements are inherited from the parent POM to the project POM.
While most of the inheritance is fine, it also inherits unwanted elements like `<license>` and `<developers>` from the parent.
To prevent this, the project POM contains empty overrides for these elements.
If you manually switch to a different parent and actually want the inheritance, you need to remove those overrides.

### How to test this project?
Use postman and use ```POST http://localhost:8080/generate-profiles``` with below request body
```json lines
[
  {
    "email": "business@example.com",
    "userIdentifiers": [
      {"key": "tax_id", "value": "12345"}
    ]
  },
  {
    "email": "consumer@example.com",
    "userIdentifiers": [
      {"key": "amazon_customer_id", "value": "amzn123"}
    ],
    
    "loyaltyPoints": {
      "platformIndicator": "amazon_prime"
    }
  },
  {
    "email": "seller@example.com",
    "userIdentifiers": [
      {"key": "paypal_email", "value": "seller@paypal.com"}
    ]
  }
]
```


