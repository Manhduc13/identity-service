package com.example.identityservice.enums;

public enum Role {
    ADMIN,
    USER
}
// Each role has different permission (privilege)
// 1 user -> many role and 1 role -> many user || many - many
// 1 role -> permission and 1 permission -> many role || many - many
