retrofit-ex1
============

Primer ejemplo de comunicación con el backend REST usando la biblioteca Retrofit

---

## Próximos pasos

1. Mantener una Interfaz de Retrofit que defina al servicio

```
public interface RetrofitServiceInterface {

    @GET("/path/{param}/")
    ItemDetail getWantedItem(
            @Path("param") String myParam);

}
```

2. Crear un servicio ``` SarazaService ``` que llame al método de la interfaz
3. Llamar a este servicio de manera asincrónica.

---

Acá hay mas info
https://udinic.wordpress.com/2012/07/30/a-festivus-for-the-rest-of-us/#more-291
