package Model.message;


import Model.entity.M3UALinkEntity;

public class M3UAMessage
  extends BaseMessage
{
  private long id;
  private M3UALinkEntity linkEntity;

  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public M3UALinkEntity getLinkEntity() {
    return this.linkEntity;
  }

  public void setLinkEntity(M3UALinkEntity linkEntity) {
    this.linkEntity = linkEntity;
  }
}
