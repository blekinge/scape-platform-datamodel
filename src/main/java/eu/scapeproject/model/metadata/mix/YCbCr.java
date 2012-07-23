package eu.scapeproject.model.metadata.mix;

public class YCbCr {
    private YCbCrSubSampling yCbCrSubSmapling;

    public YCbCr(YCbCrSubSampling yCbCrSubSmapling) {
        super();
        this.yCbCrSubSmapling = yCbCrSubSmapling;
    }

    public YCbCrSubSampling getyCbCrSubSmapling() {
        return yCbCrSubSmapling;
    }
    
    

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((yCbCrSubSmapling == null) ? 0 : yCbCrSubSmapling.hashCode());
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
        YCbCr other = (YCbCr) obj;
        if (yCbCrSubSmapling == null) {
            if (other.yCbCrSubSmapling != null)
                return false;
        } else if (!yCbCrSubSmapling.equals(other.yCbCrSubSmapling))
            return false;
        return true;
    }



    public static class YCbCrSubSampling {
        private SubSampling horiz;;
        private SubSampling vert;

        public YCbCrSubSampling(SubSampling horiz, SubSampling vert) {
            super();
            this.horiz = horiz;
            this.vert = vert;
        }

        public SubSampling getHoriz() {
            return horiz;
        }

        public SubSampling getVert() {
            return vert;
        }
        
        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((horiz == null) ? 0 : horiz.hashCode());
            result = prime * result + ((vert == null) ? 0 : vert.hashCode());
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
            YCbCrSubSampling other = (YCbCrSubSampling) obj;
            if (horiz != other.horiz)
                return false;
            if (vert != other.vert)
                return false;
            return true;
        }

        public enum SubSampling {
            EQUAL_SIZE, HALF_SIZE, QUARTER_SIZE;
            public SubSampling fromValue(short value) {
                switch (value) {
                case 1:
                    return EQUAL_SIZE;
                case 2:
                    return HALF_SIZE;
                case 4:
                    return QUARTER_SIZE;
                default:
                    return null;
                }
            }
        }
    }
}
