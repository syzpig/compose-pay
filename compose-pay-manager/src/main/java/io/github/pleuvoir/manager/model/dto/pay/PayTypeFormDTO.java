package io.github.pleuvoir.manager.model.dto.pay;

import io.github.pleuvoir.manager.model.dto.AbstractFormPageDTO;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class PayTypeFormDTO extends AbstractFormPageDTO {

	private String payTypeCode;
	private String payTypeName;
}
