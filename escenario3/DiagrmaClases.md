# Diagrama de Clases - Patrón Mediator

```mermaid


classDiagram
direction BT
class ChatRoom {
  + ChatRoom() 
  + sendMessage(String, User) void
  + addUser(User) void
}
class ChatRoomMediator {
<<Interface>>
  + addUser(User) void
  + sendMessage(String, User) void
}
class ChatUser {
  + ChatUser(String) 
  + receive(String, String) void
}
class MediatorClient {
  + MediatorClient() 
  + main(String[]) void
}
class User {
  + User(String) 
  # String name
  # ChatRoomMediator mediator
  + send(String) void
  + receive(String, String) void
   String name
   ChatRoomMediator mediator
}

ChatRoom  ..>  ChatRoomMediator 
ChatUser  -->  User 


```