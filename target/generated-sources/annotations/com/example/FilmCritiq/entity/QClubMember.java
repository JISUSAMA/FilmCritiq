package com.example.FilmCritiq.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QClubMember is a Querydsl query type for ClubMember
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QClubMember extends EntityPathBase<ClubMember> {

    private static final long serialVersionUID = 1920577444L;

    public static final QClubMember clubMember = new QClubMember("clubMember");

    public final QBasicEntity _super = new QBasicEntity(this);

    public final NumberPath<Long> cno = createNumber("cno", Long.class);

    public final StringPath email = createString("email");

    public final BooleanPath fromSocial = createBoolean("fromSocial");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modDate = _super.modDate;

    public final StringPath name = createString("name");

    public final StringPath password = createString("password");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> regDate = _super.regDate;

    public final SetPath<ClubMemberRole, EnumPath<ClubMemberRole>> roleSet = this.<ClubMemberRole, EnumPath<ClubMemberRole>>createSet("roleSet", ClubMemberRole.class, EnumPath.class, PathInits.DIRECT2);

    public QClubMember(String variable) {
        super(ClubMember.class, forVariable(variable));
    }

    public QClubMember(Path<? extends ClubMember> path) {
        super(path.getType(), path.getMetadata());
    }

    public QClubMember(PathMetadata metadata) {
        super(ClubMember.class, metadata);
    }

}

