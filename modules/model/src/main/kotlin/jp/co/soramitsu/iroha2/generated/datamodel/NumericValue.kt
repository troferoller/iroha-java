//
// Auto-generated file. DO NOT EDIT!
//
package jp.co.soramitsu.iroha2.generated.datamodel

import jp.co.soramitsu.iroha2.ModelEnum
import jp.co.soramitsu.iroha2.codec.ScaleCodecReader
import jp.co.soramitsu.iroha2.codec.ScaleCodecWriter
import jp.co.soramitsu.iroha2.codec.ScaleReader
import jp.co.soramitsu.iroha2.codec.ScaleWriter
import jp.co.soramitsu.iroha2.wrapException
import java.math.BigInteger
import kotlin.Int
import kotlin.Long

/**
 * NumericValue
 *
 * Generated from 'iroha_data_model::NumericValue' enum
 */
public sealed class NumericValue : ModelEnum {
    /**
     * @return Discriminator of variant in enum
     */
    public abstract fun discriminant(): Int

    /**
     * 'U32' variant
     */
    public data class U32(
        public val u32: Long
    ) : NumericValue() {
        public override fun discriminant(): Int = DISCRIMINANT

        public companion object : ScaleReader<U32>, ScaleWriter<U32> {
            public const val DISCRIMINANT: Int = 0

            public override fun read(reader: ScaleCodecReader): U32 = try {
                U32(
                    reader.readUint32(),
                )
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            public override fun write(writer: ScaleCodecWriter, instance: U32) = try {
                writer.writeUint32(instance.u32)
            } catch (ex: Exception) {
                throw wrapException(ex)
            }
        }
    }

    /**
     * 'U64' variant
     */
    public data class U64(
        public val u64: BigInteger
    ) : NumericValue() {
        public override fun discriminant(): Int = DISCRIMINANT

        public companion object : ScaleReader<U64>, ScaleWriter<U64> {
            public const val DISCRIMINANT: Int = 1

            public override fun read(reader: ScaleCodecReader): U64 = try {
                U64(
                    reader.readUint64(),
                )
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            public override fun write(writer: ScaleCodecWriter, instance: U64) = try {
                writer.writeUint64(instance.u64)
            } catch (ex: Exception) {
                throw wrapException(ex)
            }
        }
    }

    /**
     * 'U128' variant
     */
    public data class U128(
        public val u128: BigInteger
    ) : NumericValue() {
        public override fun discriminant(): Int = DISCRIMINANT

        public companion object : ScaleReader<U128>, ScaleWriter<U128> {
            public const val DISCRIMINANT: Int = 2

            public override fun read(reader: ScaleCodecReader): U128 = try {
                U128(
                    reader.readUint128(),
                )
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            public override fun write(writer: ScaleCodecWriter, instance: U128) = try {
                writer.writeUint128(instance.u128)
            } catch (ex: Exception) {
                throw wrapException(ex)
            }
        }
    }

    /**
     * 'Fixed' variant
     */
    public data class Fixed(
        public val fixed: jp.co.soramitsu.iroha2.generated.primitives.fixed.Fixed
    ) : NumericValue() {
        public override fun discriminant(): Int = DISCRIMINANT

        public companion object : ScaleReader<Fixed>, ScaleWriter<Fixed> {
            public const val DISCRIMINANT: Int = 3

            public override fun read(reader: ScaleCodecReader): Fixed = try {
                Fixed(
                    jp.co.soramitsu.iroha2.generated.primitives.fixed.Fixed.read(reader),
                )
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            public override fun write(writer: ScaleCodecWriter, instance: Fixed) = try {
                jp.co.soramitsu.iroha2.generated.primitives.fixed.Fixed.write(writer, instance.fixed)
            } catch (ex: Exception) {
                throw wrapException(ex)
            }
        }
    }

    public companion object : ScaleReader<NumericValue>, ScaleWriter<NumericValue> {
        public override fun read(reader: ScaleCodecReader): NumericValue = when (
            val discriminant =
                reader.readUByte()
        ) {
            0 -> U32.read(reader)
            1 -> U64.read(reader)
            2 -> U128.read(reader)
            3 -> Fixed.read(reader)
            else -> throw RuntimeException("Unresolved discriminant of the enum variant: $discriminant")
        }

        public override fun write(writer: ScaleCodecWriter, instance: NumericValue) {
            writer.directWrite(instance.discriminant())
            when (val discriminant = instance.discriminant()) {
                0 -> U32.write(writer, instance as U32)
                1 -> U64.write(writer, instance as U64)
                2 -> U128.write(writer, instance as U128)
                3 -> Fixed.write(writer, instance as Fixed)
                else -> throw RuntimeException("Unresolved discriminant of the enum variant: $discriminant")
            }
        }
    }
}
