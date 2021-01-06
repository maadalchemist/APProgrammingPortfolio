public class Vector2 {
    public float x;
    public float y;

    const ZERO = Vector2(0, 0);
    const ONE = Vector2(1, 1);
    const LEFT = Vector2(-1, 0);
    const RIGHT = Vector2(1, 0);
    const UP = Vector2(0, -1);
    const DOWN = Vector2(0, 1);

    public Vector2() {
        this.x = 0.0f;
        this.y = 0.0f;
    }

    public Vector2(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Vector2(Vector2 other) {
        this.x = other.x;
        this.y = other.y;
    }

    public Vector2 add(Vector2 other) {
        return new Vector2(this.x + other.x, this.y + other.y);
    }

    public Vector2 subtract(Vector2 other) {
        return new Vector2(this.x - other.x, this.y - other.y);
    }

    public Vector2 multiply(Vector2 other) {
        return new Vector2(this.x * other.x, this.y * other.y);
    }

    public Vector2 divide(Vector2 other) {
        return new Vector2(this.x / other.x, this.y / other.y);
    }

    public void normalize() {
        // sets length to 1
        double length = Math.sqrt(x*x + y*y);

        if (length != 0.0) {
            float s = 1.0f / (float)length;
            x = x*s;
            y = y*s;
        }
    }
}
