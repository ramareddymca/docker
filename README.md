# Please refer pom.xml and dockerFile

# Docker commands:
  D:\course-docker\product>docker build . -t "ramareddymca/newproduct:01"
  D:\course-docker\product>docker run -p 9097:9095 -d --name product02 ramareddymca/newproduct:01

D:\course-docker\product>
  
# Product service acess links via docker:
  http://localhost:9097/api/products/
  http://localhost:9097/api/products/1

# Product service acess links with-out docker:
  http://localhost:9095/api/products/
  http://localhost:9095/api/products/1
  
  Json format :
  [
    {
        "prodId": 1,
        "name": "my product21",
        "prodInfo": "my first product2 info"
    }
]


