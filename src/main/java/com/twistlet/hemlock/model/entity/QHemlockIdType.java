package com.twistlet.hemlock.model.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QHemlockIdType is a Querydsl query type for HemlockIdType
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QHemlockIdType extends EntityPathBase<HemlockIdType> {

    private static final long serialVersionUID = 267761930L;

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

    public QHemlockIdType(PathMetadata metadata) {
        super(HemlockIdType.class, metadata);
    }

}

