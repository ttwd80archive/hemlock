package com.twistlet.hemlock.model.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QHemlockIdType is a Querydsl query type for HemlockIdType
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QHemlockIdType extends EntityPathBase<HemlockIdType> {

    private static final long serialVersionUID = 267761930;

    public static final QHemlockIdType hemlockIdType = new QHemlockIdType("hemlockIdType");

    public final SetPath<HemlockPatient, QHemlockPatient> hemlockPatients = this.<HemlockPatient, QHemlockPatient>createSet("hemlockPatients", HemlockPatient.class, QHemlockPatient.class, PathInits.DIRECT2);

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final StringPath name = createString("name");

    public QHemlockIdType(String variable) {
        super(HemlockIdType.class, forVariable(variable));
    }

    public QHemlockIdType(Path<? extends HemlockIdType> path) {
        super(path.getType(), path.getMetadata());
    }

    public QHemlockIdType(PathMetadata<?> metadata) {
        super(HemlockIdType.class, metadata);
    }

}

