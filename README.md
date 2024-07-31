Local Horizontal Scaling : 

STEP : 1 - Right Click on "demo-service"

STEP : 2 - Run As

STEP : 3 - Run Configurations

STEP : 4 - (Left Menu) Spring Boot App > demo-service > Right Click > New Configuration 

STEP : 5 - Name      : Type configuration name . Eg : demo-service 8082

STEP : 6 - Project   : Select project "demo-service"

STEP : 7 - Main Type : Search Button > "DemoServiceApplication"

STEP : 8 - (Tab) Arguments > Program Argument  

STEP : 9 - Paste the another "application2.properties" location. (--spring.config.location=classpath:/application2.properties)

NOTE : Including double hyphen
