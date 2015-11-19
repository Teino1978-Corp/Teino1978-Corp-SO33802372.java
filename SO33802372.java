class abc {

  public static void main(String[] args) {
    DomainObject subDomain = null;
    Map<DomainField, String> d = null;
    subDomain.add(DomainField.ZIP, d.get(DomainField.ZIP));
  }

  private static interface SomeOtherInterface { }
  private static class FieldValueAssociation { }
  private static enum DomainField { ZIP;}
  public interface MValue extends SomeOtherInterface, Serializable { }
  public interface DomainObject extends Iterable<FieldValueAssociation>, Cloneable, Serializable {
    void add(DomainField field, MValue... values);
  }
}