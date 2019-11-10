## To start this application

1. Build
```bash
gradlew build
```

2. Run
```bash
java -jar build/libs/oneio-1.0-SNAPSHOT.jar 
```

3. Run tests
```bash
gradlew test
```

4. Use any HttpClient (like Postman) to send request

`POST localhost:8080/handle`

Body:
```
{
    "numbers": [1, 2, -1, 3, 15, 20, 0]
}
```
