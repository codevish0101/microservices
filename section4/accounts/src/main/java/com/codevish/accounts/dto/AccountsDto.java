package com.codevish.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Schema(
        name = "Accounts",
        description = "Schema to hold Account information"
)
@Data
public class AccountsDto {

    @Schema(
            description = "Account number of Codevish account",
            example = "3454433243"
    )
    @NotEmpty(message = "AccountNumber can not be a null or empty")
    @Pattern(regexp="(^$|[0-9]{10})",message = "AccountNumber must be 10 digits")
    private Long accountNumber;

    @Schema(
            description = "Account type of Codevish account",
            example = "Savings"
    )
    @NotEmpty(message = "AccountType can not be a null or empty")
    private String accountType;

    @Schema(
            description = "CodeVish branch address",
            example = "123 New York"
    )
    @NotEmpty(message = "BranchAddress can not be a null or empty")
    private String branchAddress;
}
