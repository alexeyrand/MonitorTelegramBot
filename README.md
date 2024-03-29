## **Monitor Telegram Bot**
### **Описание проекта**
Телеграм бот для отслеживания объявлений о продаже товаров с таких площадок, как Avito, TheMarket, Ebay. MonitorItemsBot и MonitorItems service представляют из себя Spring Boot приложения.
+ Общение бота с сервисом монитора происходит по REST API
+ Возможность отслеживать несколько ссылок в многопоточном режиме
+ Минимальная задержка
+ Возможность парсить защищенные сайты
+ База данных фейк продавцов
### **Общая структурная схема архитектуры**
- Monitor telegram bot представляет из себя spring boot приложение, отвечающее за функционирование телеграм бота.
- [Monitor](https://github.com/alexeyrand/MonitorTelegramBot/edit/main/README.md) - spring boot приложение, в котором сосредаточена основная бизнес логика парсинга и мониторинга страниц.  
  ![Structure schema](/images/schema.png)

### **Технологии**
+ Java 17
+ Spring Boot 3
+ H2 database
+ Selenium framework
+ Telegram api
+ Discord api
+ REST
+ Multithreading
+ Junit
+ Mockito
### **Endpoints**
**GET /api/v2/stop**   
**POST /api/v2/start**    
**POST /api/v2/urls**

### **Как использовать**
```
sudo java -jar
```
### **Deploy и CI/CD**
### **TODO**
+ :white_check_mark: Create a black list of sellers
+ :white_check_mark: Fix NoSuchElementException for image
+ :white_check_mark: Fix Out of Memery Chrome driver
+ :white_check_mark: Add Datebase H2
+ Add autotest (in progress)
+ Add 3-5 urls monitoring (rollback)
  
