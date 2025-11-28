# TP gRPC Project

Ce projet implémente un serveur et un client gRPC simple pour l'authentification d'un utilisateur, basé sur le TP fourni.

## Structure

- `src/main/proto/user.proto`: Définition du service gRPC.
- `src/main/java/app/grpc/ServeurGrpc.java`: Serveur gRPC.
- `src/main/java/app/grpc/ClientGrpc.java`: Client gRPC.
- `src/main/java/app/grpc/UserService.java`: Implémentation du service.

## Compilation

```bash
mvn compile
```

## Exécution

1. Démarrer le serveur :
   Exécuter la classe `app.grpc.ServeurGrpc`.

2. Démarrer le client :
   Exécuter la classe `app.grpc.ClientGrpc`.
