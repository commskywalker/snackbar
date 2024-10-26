 
## 📍Products Endpoints

| route               | description                                          
|----------------------|-----------------------------------------------------
| <kbd>GET /api/products</kbd>     | See [request details](#get-products)
| <kbd>GET /api/products/{id}</kbd>     |  See [request details](#get-products-id)
| <kbd>GET /api/products/category/{category}</kbd>     |See [request details](#get-products-category)
| <kbd>POST /api/products</kbd>     | See [request details](#post-products)
| <kbd>PUT /api/products/{id}</kbd>     | See [request details](#put-products)
| <kbd>DELETE /api/products/{id}</kbd>     | Will only return the HTTP status code. 


<h3 id="get-products">GET /api/products</h3>

**RESPOSNSE**  
```json
{
    "success": true,
    "message": "Products retrieved successfully",
    "data": [
        {
            "id": "671bb29c52801c1c1efe6911",
            "category": "Lanche",
            "description": "Hambúrguer artesanal 160g, servido com pão de brioche, alface e tomate.",
            "name": "Hambúrguer",
            "price": 30
        },
        {
            "id": "671bb29c52801c1c1efe6912",
            "category": "Acompanhamento",
            "description": "Batatas fritas crocantes com ketchup",
            "name": "Batata frita",
            "price": 15
        }
    ]
}
```

<h3 id="get-products-id">GET /api/products/{id}</h3>

**RESPONSE**
```json
{
    "success": true,
    "message": "Product retrieved successfully",
    "data": {
        "id": "671d1ab834d76230acfe6911",
        "category": "Lanche",
        "description": "Hambúrguer artesanal 160g, servido com pão de brioche, alface e tomate.",
        "name": "Hambúrguer",
        "price": 30
    }
}
```

<h3 id="get-products-category">GET /api/products/category/{category}</h3>

**RESPONSE**
```json
{
    "success": true,
    "message": "Products retrieved successfully",
    "data": [
        {
            "id": "671d1ab834d76230acfe6911",
            "category": "Lanche",
            "description": "Hambúrguer artesanal 160g, servido com pão de brioche, alface e tomate.",
            "name": "Hambúrguer",
            "price": 30
        },
        {
            "id": "671d1ab834d76230acfe6915",
            "category": "Lanche",
            "description": "Pizza de mussarela com tomate e manjericão.",
            "name": "Pizza",
            "price": 25
        }
    ]
}
```
<h3 id="post-products">POST /registerClient/:idUser</h3>

**REQUEST**  
```json
{
    "name": "Hambúrguer",
    "category": "Lanche",
    "description": "Hambúrguer artesanal 160g, servido com pão de brioche, alface e tomate.",
    "price": 10
}
```
**RESPONSE**
```json
{
    "success": true,
    "message": "Product created successfully",
    "data": {
        "id": "671d1c91f7689b2849534586",
        "category": "Lanche",
        "description": "Hambúrguer artesanal 160g, servido com pão de brioche, alface e tomate.",
        "name": "Hambúrguer",
        "price": 10
    }
}
```

<h3 id="put-products">PUT /api/products/{id}</h3>

**REQUEST**  
```json
{
    "name": "Salada",
    "category": "Acompanhamento",
    "description": "Batatas fritas com ketchup",
    "price": 10
}
```

**RESPONSE**  
```json
{
    "success": true,
    "message": "Product updated successfully",
    "data": {
        "id": "671d1c91f7689b2849534586",
        "category": "Acompanhamento",
        "description": "Batatas fritas crocantes com ketchup",
        "name": "Batata frita",
        "price": 15
    }
}
```
