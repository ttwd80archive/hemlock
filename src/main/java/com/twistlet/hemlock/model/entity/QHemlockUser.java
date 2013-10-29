package com.twistlet.hemlock.model.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QHemlockUser is a Querydsl query type for HemlockUser
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QHemlockUser extends EntityPathBase<HemlockUser> {

    private static final long serialVersionUID = 438639392;

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

    public QHemlockUser(PathMetadata<?> metadata) {
        super(HemlockUser.class, metadata);
    }

}

