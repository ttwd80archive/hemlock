package com.twistlet.hemlock.model.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QHemlockRole is a Querydsl query type for HemlockRole
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QHemlockRole extends EntityPathBase<HemlockRole> {

    private static final long serialVersionUID = 438546379;

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

    public QHemlockRole(PathMetadata<?> metadata) {
        super(HemlockRole.class, metadata);
    }

}

