package com.twistlet.hemlock.model.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QHemlockUser is a Querydsl query type for HemlockUser
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QHemlockUser extends EntityPathBase<HemlockUser> {

    private static final long serialVersionUID = 438639392L;

    public static final QHemlockUser hemlockUser = new QHemlockUser("hemlockUser");

    public final SetPath<HemlockUserRole, QHemlockUserRole> hemlockUserRoles = this.<HemlockUserRole, QHemlockUserRole>createSet("hemlockUserRoles", HemlockUserRole.class, QHemlockUserRole.class, PathInits.DIRECT2);

    public final StringPath name = createString("name");

    public final StringPath password = createString("password");

    public final StringPath username = createString("username");

    public QHemlockUser(String variable) {
        super(HemlockUser.class, forVariable(variable));
    }

    public QHemlockUser(Path<? extends HemlockUser> path) {
        super(path.getType(), path.getMetadata());
    }

    public QHemlockUser(PathMetadata metadata) {
        super(HemlockUser.class, metadata);
    }

}

