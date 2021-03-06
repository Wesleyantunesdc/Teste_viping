package br.com.nsinova.viping.modelo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Notificacao implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private Long id;
	private String resource;
	private Integer user_id;
	private String topic;
	private Integer aplication_id;
	private Integer attempts;
	private Date sent;
	private Date received;

	public Notificacao() {
	}

	public Notificacao(Long id, String resource, Integer user_id, String topic, Integer aplication_id, Integer attempts,
			Date sent, Date received) {
		super();
		this.id = id;
		this.resource = resource;
		this.user_id = user_id;
		this.topic = topic;
		this.aplication_id = aplication_id;
		this.attempts = attempts;
		this.sent = sent;
		this.received = received;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getResource() {
		return resource;
	}

	public void setResource(String resource) {
		this.resource = resource;
	}

	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public Integer getAplication_id() {
		return aplication_id;
	}

	public void setAplication_id(Integer aplication_id) {
		this.aplication_id = aplication_id;
	}

	public Integer getAttempts() {
		return attempts;
	}

	public void setAttempts(Integer attempts) {
		this.attempts = attempts;
	}

	public Date getSent() {
		return sent;
	}

	public void setSent(Date sent) {
		this.sent = sent;
	}

	public Date getReceived() {
		return received;
	}

	public void setReceived(Date received) {
		this.received = received;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((aplication_id == null) ? 0 : aplication_id.hashCode());
		result = prime * result + ((attempts == null) ? 0 : attempts.hashCode());
		result = prime * result + ((received == null) ? 0 : received.hashCode());
		result = prime * result + ((resource == null) ? 0 : resource.hashCode());
		result = prime * result + ((sent == null) ? 0 : sent.hashCode());
		result = prime * result + ((topic == null) ? 0 : topic.hashCode());
		result = prime * result + ((user_id == null) ? 0 : user_id.hashCode());
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
		Notificacao other = (Notificacao) obj;
		if (aplication_id == null) {
			if (other.aplication_id != null)
				return false;
		} else if (!aplication_id.equals(other.aplication_id))
			return false;
		if (attempts == null) {
			if (other.attempts != null)
				return false;
		} else if (!attempts.equals(other.attempts))
			return false;
		if (received == null) {
			if (other.received != null)
				return false;
		} else if (!received.equals(other.received))
			return false;
		if (resource == null) {
			if (other.resource != null)
				return false;
		} else if (!resource.equals(other.resource))
			return false;
		if (sent == null) {
			if (other.sent != null)
				return false;
		} else if (!sent.equals(other.sent))
			return false;
		if (topic == null) {
			if (other.topic != null)
				return false;
		} else if (!topic.equals(other.topic))
			return false;
		if (user_id == null) {
			if (other.user_id != null)
				return false;
		} else if (!user_id.equals(other.user_id))
			return false;
		return true;
	}

}
