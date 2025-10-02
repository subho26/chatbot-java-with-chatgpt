# chatbot-java-with-chatgpt

add secret from OpenAI and add to property "openai.secret" in application.perperties file

A simple chatbot application in Java using Spring Boot and OpenAI

sample CURL request to test the application

curl --request POST \
--url http://localhost:8080/bot/chat \
--header 'Content-Type: application/json' \
--data '{
"prompt" : "List down top 10 the stocks part of Nifty50 sorted based on market cap in descending order"
}'


