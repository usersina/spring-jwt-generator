# Sprint Boot JWT Generator
This is a microservice for managing authentication & protecting routes using Json Web Token.


## Usage:
1. Start a database.
2. Uncomment the `init_users` method in the [entry point file.](https://github.com/usersina/spring-jwt-generator/blob/4bfe79000f43dc562d11974d7b4c99e0fa6f8fb8/src/main/java/com/example/demo/JwtGeneratorApplication.java#L30-L46)
3. Start the server.
4. Submit the following **POST** request to `http://localhost:8081/users/login`

```JAVASCRIPT
{
    "username": "Admin",
    "password": "123"
}
```

The generated token can be found in the response headers under `Authorization`.
