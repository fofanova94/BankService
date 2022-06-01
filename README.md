curl localhost:8080
curl -X POST -d "{\"name\":\"Ivan\",\"age\":45,\"place\":\"Moscow\"}" -H "Content-Type: application/json;charset=UTF-8" -v http://localhost:8080/add
curl -X POST -d "{\"title\":\"JSON note\", \"content\": \"name":"Petr","age":45,"place":"Moscow"}" -H "Content-Type: application/json;charset=UTF-8" -v http://localhost:8080/add
добавить апи на получение всех пользователей, на получение пользователей по имени 