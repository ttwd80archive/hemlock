package com.twistlet.hemlock.model.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QHemlockPatient is a Querydsl query type for HemlockPatient
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QHemlockPatient extends EntityPathBase<HemlockPatient> {

    private static final long serialVersionUID = 1571422096;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QHemlockPatient hemlockPatient = new QHemlockPatient("hemlockPatient");

    public final DatePath<java.util.Date> birthDate = createDate("birthDate", java.util.Date.class);

    public final StringPath contactNo = createString("contactNo");

    public final QHemlockIdType hemlockIdType;

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final StringPath idNo = createString("idNo");

    public QHemlockPatient(String variable) {
        this(HemlockPatient.class, forVariable(variable), INITS);
    }

    public QHemlockPatient(Path<? extends HemlockPatient> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QHemlockPatient(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QHemlockPatient(PathMetadata<?> metadata, PathInits inits) {
        this(HemlockPatient.class, metadata, inits);
    }

    public QHemlockPatient(Class<? extends HemlockPatient> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.hemlockIdType = inits.isInitialized("hemlockIdType") ? new QHemlockIdType(forProperty("hemlockIdType")) : null;
    }

}

