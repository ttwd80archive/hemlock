package com.twistlet.hemlock.model.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QHemlockUserRole is a Querydsl query type for HemlockUserRole
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QHemlockUserRole extends EntityPathBase<HemlockUserRole> {

    private static final long serialVersionUID = -32931914;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QHemlockUserRole hemlockUserRole = new QHemlockUserRole("hemlockUserRole");

    public final QHemlockRole hemlockRole;

    public final QHemlockUser hemlockUser;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public QHemlockUserRole(String variable) {
        this(HemlockUserRole.class, forVariable(variable), INITS);
    }

    public QHemlockUserRole(Path<? extends HemlockUserRole> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QHemlockUserRole(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QHemlockUserRole(PathMetadata<?> metadata, PathInits inits) {
        this(HemlockUserRole.class, metadata, inits);
    }

    public QHemlockUserRole(Class<? extends HemlockUserRole> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.hemlockRole = inits.isInitialized("hemlockRole") ? new QHemlockRole(forProperty("hemlockRole")) : null;
        this.hemlockUser = inits.isInitialized("hemlockUser") ? new QHemlockUser(forProperty("hemlockUser")) : null;
    }

}

