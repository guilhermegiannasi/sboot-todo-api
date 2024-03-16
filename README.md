# Todo API

This is a Todo API built with Spring Boot. It allows users to manage a to-do list.

## Functionalities

The API supports the following operations:

- **Create a task**: Users can add a new task to the list.
- **Update a task**: Users can update the status or content of a task.
- **List all tasks**: Users can see all tasks in the list.
- **Delete a task**: Users can remove a task from the list.

## API documentation

API documentation is automatically generated using Swagger. You can access the API documentation at `/swagger-ui.html`.

## Tests

This API includes unit tests to ensure code quality and correct functionality. The tests were written using JUnit and Mockito.

## How to use

To use the API, make an HTTP request to the appropriate endpoint. Here are some examples:

- **Create a task**: Make a POST request to `/api/tasks/save` with the request body containing the task details.
- **Update a task**: Make a PUT request to `/api/tasks/{id}` with the request body containing the new task details.
- **List all tasks**: Make a GET request to `/api/tasks`.
- **Delete a task**: Make a DELETE request to `/api/tasks/{id}`.

## Contributing

If you want to contribute to this project, please fork the repository and submit a pull request.

## License

This project is licensed under the MIT License.
