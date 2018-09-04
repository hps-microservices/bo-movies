package com.msvvdv.bomoviescore.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@ToString
@EqualsAndHashCode
@Document(collection = "sequence")
public class SequenceId {
	@Id
	private String id;
	private long seq;
}
