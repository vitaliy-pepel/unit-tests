# Задание 1

1. Они позволяют изолировать тестируемый код от внешних зависимостей. Тестовые заглушки заменяют эти зависимости, позволяя контролировать и проверять поведение тестируемого кода.

2. Следует использовать Stub-тестовые заглушки. Они позволяют определить, какие аргументы были переданы в метод, и проверить, соответствуют ли они ожидаемым значениям.

3. Следует использовать Spy-тестовые заглушки или Return-Value тестовые заглушки. Эти заглушки позволяют определить возвращаемое значение для каждого метода, что позволяет проверить, возвращает ли метод ожидаемое значение.

4. Для имитации взаимодействия с внешним API или базой данных используют Fake-тестовые заглушки (FakeObject) или Stub-тестовые заглушки с возможностью контроля ввода/вывода (IO-Control Stubs).

# Задание 2
Используем Mockito для создания mock-объекта BookRepository и внедреним его в класс BookService для тестирования.

```
    @Mock BookRepository bookRepository;

    @Test
    public void testGetBookById() {
        // Arrange
        Book book = new Book("Harry Potter and the Sorcerer's Stone", "J.K. Rowling");
        when(bookRepository.getBookById(1)).thenReturn(book);

        // Act
        Book returnedBook = bookService.getBookById(1);

        // Assert
        assertEquals(book.getTitle(), returnedBook.getTitle());
        assertEquals(book.getAuthor(), returnedBook.getAuthor());
    }
```
