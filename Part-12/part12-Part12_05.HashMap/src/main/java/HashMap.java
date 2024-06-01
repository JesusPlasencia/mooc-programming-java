
public class HashMap<K, V> {

    // A HashMap is an array of List, a Key-Pair is inside of the List
    private List<Pair<K, V>>[] values;
    private int firstFreeIndex;

    public HashMap() {
        this.values = new List[32];
        this.firstFreeIndex = 0;
    }

    public V get(K key) {
        // Better Performance using bitwise [0 - 31]
        int hashValue = getHashValue(key);
        if (this.values[hashValue] == null) {
            return null;
        }

        List<Pair<K, V>> bucket = this.values[hashValue];

        for (int i = 0; i < bucket.size(); i++) {
            if (bucket.value(i).getKey().equals(key)) {
                return bucket.value(i).getValue();
            }
        }

        return null;
    }

    public void add(K key, V value) {
        List<Pair<K, V>> bucket = getBucketByKey(key);
        int index = getIndexInBucketByKey(bucket, key);
        if (index < 0) {
            bucket.add(new Pair<>(key, value));
            this.firstFreeIndex++;
        } else {
            bucket.value(index).setValue(value);
        }

        if (1.0 * this.firstFreeIndex / this.values.length > 0.75) {
            grow();
        }
    }

    public V remove(K key) {
        List<Pair<K, V>> bucket = getBucketByKey(key);
        if (bucket.size() == 0) {
            return null;
        }

        int index = getIndexInBucketByKey(bucket, key);
        if (index == -1) {
            return null;
        }

        Pair<K, V> pair = bucket.value(index);
        bucket.remove(pair);
        return pair.getValue();
    }

    // PRIVATE METHODS
    private void grow() {
        List<Pair<K, V>>[] newHashMap = new List[this.values.length * 2];
        for (int idxBucket = 0; idxBucket < this.values.length; idxBucket++) {
            copy(newHashMap, idxBucket);
        }

        this.values = newHashMap;
    }
    
    private void copy(List<Pair<K, V>>[] newOne, int fromIdx) {
        List<Pair<K, V>> bucket = this.values[fromIdx];
        
        if (bucket == null) {
            return;
        }
        
        for (int i = 0; i < bucket.size(); i++) {
            Pair<K, V> value = bucket.value(i);

            int hashValue = getHashValue(value.getKey());
            if (newOne[hashValue] == null) {
                newOne[hashValue] = new List<>();
            }

            newOne[hashValue].add(value);
        }
    }
    
    private int getHashValue(K key) {
        return ((this.values.length - 1) & key.hashCode());
    }

    private List<Pair<K, V>> getBucketByKey(K key) {
        int hashValue = getHashValue(key);
        if (this.values[hashValue] == null) {
            this.values[hashValue] = new List<>();
        }
        // Return a new Bucket or a bucket with pair objects (depends on the key)
        return this.values[hashValue];
    }

    private int getIndexInBucketByKey(List<Pair<K, V>> bucket, K key) {
        for (int i = 0; i < bucket.size(); i++) {
            if (bucket.value(i).getKey().equals(key)) {
                return i;
            }
        }
        return -1;
    }

}
