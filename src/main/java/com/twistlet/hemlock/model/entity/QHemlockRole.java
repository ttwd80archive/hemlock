package com.twistlet.hemlock.model.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QHemlockRole is a Querydsl query type for HemlockRole
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QHemlockRole extends EntityPathBase<HemlockRole> {

    private static final long serialVersionUID = 438546379L;

    public static final QHemlockRole hemlockRole = new QHemlockRole("hemlockRole");

    public final SetPath<HemlockUserRole, QHemlockUserRole> hemlockUserRoles = this.<HemlockUserRole, QHemlockUserRole>createSet("hemlockUserRoles", HemlockUserRole.class, QHemlockUserRole.class, PathInits.DIRECT2);

    public final StringPath roleDescription = createString("roleDescription");

    public final StringPath roleName = createString("roleName");

    public QHemlockRole(String variable) {
        super(HemlockRole.class, forVariable(variable));
    }

    public QHemlockRole(Path<? extends HemlockRole> path) {
        super(path.getType(), path.getMetadata());
    }

    public QHemlockRole(PathMetadata metadata) {
        super(HemlockRole.class, metadata);
    }

}

