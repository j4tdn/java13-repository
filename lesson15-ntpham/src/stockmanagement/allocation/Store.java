package stockmanagement.allocation;

import java.math.BigDecimal;
import java.util.Objects;

public class Store {

    private Long storeId; // mĂ£ cá»­a hĂ ng
    private Long referenceStoreId; // mĂ£ cá»­a hĂ ng liĂªn quan - sá»­ dá»¥ng khi cá»­a hĂ ng hiá»‡n táº¡i háº¿t hĂ ng
    private BigDecimal stockPreviousDay; // sá»‘ lÆ°á»£ng bĂ¡n ngĂ y hĂ´m qua
    private BigDecimal expectedSales; // doanh sá»‘ bĂ¡n hĂ ng dá»± kiáº¿n
    private Boolean isSelected; // true - cá»­a hĂ ng Ä‘Æ°á»£c chá»�n Ä‘á»ƒ allocate(cáº¥p phĂ¡t)
    private BigDecimal allocationKey;
    private Integer amountAllocated;
    private Integer demand;

    public Store() {
    }

    public Store(final Long storeId,
                 final Long referenceStoreId,
                 final BigDecimal stockPreviousDay,
                 final BigDecimal expectedSales,
                 final Boolean isSelected) {
        this.storeId = storeId;
        this.referenceStoreId = referenceStoreId;
        this.stockPreviousDay = stockPreviousDay;
        this.expectedSales = expectedSales;
        this.isSelected = isSelected;
    }

    public Store allocationKey(BigDecimal allocationKey) {
        this.allocationKey = allocationKey;
        return this;
    }

    public Store amountAllocated(Integer amountAllocated) {
        this.amountAllocated = amountAllocated;
        return this;
    }

    public Store demand(Integer demand) {
        this.demand = demand;
        return this;
    }

    public BigDecimal getAllocationKey() {
        return allocationKey;
    }

    public void setAllocationKey(BigDecimal allocationKey) {
        this.allocationKey = allocationKey;
    }

    public Integer getAmountAllocated() {
        return amountAllocated;
    }

    public void setAmountAllocated(Integer amountAllocated) {
        this.amountAllocated = amountAllocated;
    }

    public Integer getDemand() {
        return demand;
    }

    public void setDemand(Integer demand) {
        this.demand = demand;
    }

    public Long getStoreId() {
        return storeId;
    }

    public void setStoreId(final Long storeId) {
        this.storeId = storeId;
    }

    public Long getReferenceStoreId() {
        return referenceStoreId;
    }

    public void setReferenceStoreId(final Long referenceStoreId) {
        this.referenceStoreId = referenceStoreId;
    }

    public BigDecimal getStockPreviousDay() {
        return stockPreviousDay;
    }

    public void setStorePreviousDay(final BigDecimal stockPreviousDay) {
        this.stockPreviousDay = stockPreviousDay;
    }

    public BigDecimal getExpectedSales() {
        return expectedSales;
    }

    public void setExpectedSales(final BigDecimal expectedSales) {
        this.expectedSales = expectedSales;
    }

    public Boolean getSelected() {
        return isSelected;
    }

    public void setSelected(final Boolean selected) {
        isSelected = selected;
    }

    public static Integer different(Store store) {
        return store.amountAllocated - store.demand;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }

        if (!(o instanceof Store)) {
            return false;
        }

        final Store that = (Store) o;

        return getStoreId().equals(that.getStoreId());

    }

    @Override
    public int hashCode() {
        return Objects.hash(getStoreId());
    }

    @Override
    public String toString() {
        return "Store [storeId=" + storeId + ", referenceStoreId=" + referenceStoreId + ", stockPreviousDay="
                + stockPreviousDay + ", expectedSales=" + expectedSales + ", isSelected=" + isSelected + "]";
    }

}