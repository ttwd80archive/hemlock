package com.twistlet.hemlock.model.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QHemlockUserRole is a Querydsl query type for HemlockUserRole
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QHemlockUserRole extends EntityPathBase<HemlockUserRole> {

    private static final long serialVersionUID = -32931914L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QHemlockUserRole hemlockUserRole = new QHemlockUserRole("hemlockUserRole");

    public final QHemlockRole hemlockRole;

    public final QHemlockUser hemlockUser;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public QHemlockUserRole(String variable) {
        this(HemlockUserRole.class, forVariable(variable), INITS);
    }

    public QHemlockUserRole(Path<? extends HemlockUserRole> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QHemlockUserRole(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QHemlockUserRole(PathMetadata metadata, PathInits inits) {
        this(HemlockUserRole.class, metadata, inits);
    }

    public QHemlockUserRole(Class<? extends HemlockUserRole> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.hemlockRole = inits.isInitialized("hemlockRole") ? new QHemlockRole(forProperty("hemlockRole")) : null;
        this.hemlockUser = inits.isInitialized("hemlockUser") ? new QHemlockUser(forProperty("hemlockUser")) : null;
    }

}

