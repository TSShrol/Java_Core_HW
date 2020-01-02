package java_core_lesson14.task1;

public class Product implements Comparable<Product>{
private String tovar;
private String provisioner;
private int count_tovar;

public Product(String tovar, String provisioner, int count_tovar) {
	this.tovar = tovar;
	this.provisioner = provisioner;
	this.count_tovar = count_tovar;
}
public String getTovar() {
	return tovar;
}
public void setTovar(String tovar) {
	this.tovar = tovar;
}
public int getCount_tovar() {
	return count_tovar;
}
public void setCount_tovar(int count_tovar) {
	this.count_tovar = count_tovar;
}

public String getProvisioner() {
	return provisioner;
}
public void setProvisioner(String provisioner) {
	this.provisioner = provisioner;
}

@Override
public String toString() {
	return "Products [tovar=" + tovar + ", provisioner=" + provisioner + ", count_tovar=" + count_tovar + "]";
}


@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + count_tovar;
	result = prime * result + ((provisioner == null) ? 0 : provisioner.hashCode());
	result = prime * result + ((tovar == null) ? 0 : tovar.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Product other = (Product) obj;
	if (count_tovar != other.count_tovar)
		return false;
	if (provisioner == null) {
		if (other.provisioner != null)
			return false;
	} else if (!provisioner.equals(other.provisioner))
		return false;
	if (tovar == null) {
		if (other.tovar != null)
			return false;
	} else if (!tovar.equals(other.tovar))
		return false;
	return true;
}
@Override
public int compareTo(Product o) {
	if (this.tovar.compareToIgnoreCase(o.getTovar())>0) {
		return 1;
	} else {
		if (this.tovar.compareToIgnoreCase(o.getTovar())<0) {
			return -1;
		}else {
			if(this.provisioner.compareToIgnoreCase(o.getProvisioner())>0) {
				return 1;
			}else {
				if (this.provisioner.compareToIgnoreCase(o.getProvisioner())<0) {
					return -1;
				}else {
					if(this.count_tovar>o.getCount_tovar()) {
						return 1;
					}else {
						if(this.count_tovar<o.getCount_tovar()) {
							return -1;
						}
					}
				}
				
			}
		}
	}
	return 0;
}


}
